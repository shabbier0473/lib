def call(String command){
    if  ( command == "hai" )
    {
      node{
          stage('compile'){
                   echo "hai"
           }
      }
    }
}
