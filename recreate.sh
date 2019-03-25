#!/usr/bin/env sh

kubectl delete deployments.apps example-service
kubectl delete deployments.apps example-client
kubectl delete deployments.apps secure-deployment

kubectl delete service example-service
kubectl delete service example-client
kubectl delete service secure-service-port-name
kubectl delete service secure-service-port-number
kubectl delete service secure-service-labels

./gradlew clean jib
kubectl create -f kubernetes.yml