def call(String command){
    if  ( command == "hai" )
    {
      node{
          stage('compile'){
                   sh "mvn install"
           }
      }
    }
}
