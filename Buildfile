repositories.remote << 'http://www.ibiblio.org/maven2'

# http://buildr.apache.org/installing.html
# On OS X installing buildr: sudo gem update --system; sudo env JAVA_HOME=$JAVA_HOME gem install buildr

Project.local_task :run

define 'sample-build-buildr' do
  project.version = '0.1.0'
  package :jar
  
  compile.with 'com.google.guava:guava:jar:r07'
  
  task :run => :compile do
    system 'java -cp target/classes com.thoughtworks.twu.HelloWorld'
  end
  
end
