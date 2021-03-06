pipelineJob('Bkup-1') {

  description('')

  displayName('Bkup-1')
 
   configure { flowdefinition ->

    flowdefinition << delegate.'definition'(class:'org.jenkinsci.plugins.workflow.cps.CpsScmFlowDefinition',plugin:'workflow-cps@2689.v434009a_31b_f1') {

      'scm'(class:'hudson.plugins.git.GitSCM',plugin:'git') {

        'configVersion'(2)

        'userRemoteConfigs' {

          'hudson.plugins.git.UserRemoteConfig' {

            'url'('https://github.com/ganeshgohane/b-17.git')

            'credentialsId'('github-user-pswd')

          }

        }

        'branches' {

          'hudson.plugins.git.BranchSpec' {

            'name'('*/master')

          }

        }

        'doGenerateSubmoduleConfigurations'(false)

        'submoduleCfg'(class:'empty-list')

        'extensions'()

      }

      'scriptPath'('PIPELINE/scripted.groovy')

      'lightweight'(true)

    }

  }

}
