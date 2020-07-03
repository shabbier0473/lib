node{
    stage('source'){
        git url: 'https://github.com/shabbier0473/aa.git'
        branch:  'master'
    }
    stage('compile'){
        echo "hello"
        
    }
}
