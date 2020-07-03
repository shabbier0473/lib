def call(String command){
    if  ( command == "hai" )
    {
      node{ 
          ws ("/var/lib/jenkins/workspace/${JOB_NAME}")
          stage('compile'){
                   sh "mvn install"
           }
      }
    }
}
