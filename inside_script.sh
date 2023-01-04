sudo yum install git
sudo yum install java-1.8.0-openjdk-devel
sudo yum install apache-maven
mkdir daemon
cd daemon
git pull https://github.com/im4nuj/AWS-demo.git
mvn clean install
