mvn package -Dmaven.test.skip=true
docker build --tag sample:latest .