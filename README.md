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

```bash
kubectl create -f ./kubenetes/pods/app.yml --namespace=spring-cloud-example
```

```bash
kubectl get pod spring-cloud-order-service-pod --namespace=spring-cloud-example
```

```bash
kubectl delete pod spring-cloud-order-service --namespace=spring-cloud-example
```