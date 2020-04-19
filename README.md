# kubernetes-spring-cloud-order-service

### Run
```bash
./gradlew bootRun
```

### build, tag and push
```bash
./gradlew clean build
```

```bash
docker build . -t kubernetes-spring-cloud-order-service
```

```bash
docker run -p 8080:8080 kubernetes-spring-cloud-order-service
```

```bash
export DOCKER_ID_USER="benweizhu" ## put your docker-hub username
```


```bash
docker tag kubernetes-spring-cloud-order-service $DOCKER_ID_USER/kubernetes-spring-cloud-order-service
```

```bash
docker push $DOCKER_ID_USER/kubernetes-spring-cloud-order-service
```

```bash
docker pull $DOCKER_ID_USER/kubernetes-spring-cloud-order-service
```

### kubernetes

```
kubectl create deployment spring-cloud-order-service --image=benweizhu/kubernetes-spring-cloud-order-service --dry-run -o=yaml > deployment.yaml

kubectl create service clusterip spring-cloud-order-service --tcp=8080:8080 --dry-run -o=yaml >> deployment.yaml

remember add '---' between two configuation to make yaml valid
```

```
kubectl apply -f deployment.yaml

## deployment.apps/spring-cloud-order-service created
## service/spring-cloud-order-service created
```

```
kubectl port-forward svc/demo 8080:8080
```

```
curl localhost:8080/actuator/health
```

### reference
https://github.com/benweizhu/kubernetes-spring-cloud-example