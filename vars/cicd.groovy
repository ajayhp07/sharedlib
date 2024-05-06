def newGit(repo)
{
  git"https://github.com/ajayhp07/${repo}.git"
}
def mvn()
{
  sh"mvn package"
}
def newdeploy(jobname,ip,context)
{
  sh"scp /var/lib/jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat10/webapps/${context}.war"
}
def test(jobname)
{
  sh"java -jar /var/lib/jenkins/workspace/${jobname}/testing.jar"
}
