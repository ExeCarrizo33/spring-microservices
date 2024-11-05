# Spring Microservices Project

Este repositorio contiene una arquitectura de microservicios construida con Spring Boot y Spring Cloud, diseñada para ser escalable y modular.

## Descripción

El proyecto implementa un conjunto de microservicios interconectados que gestionan distintos aspectos de un sistema distribuido. Cada microservicio tiene una responsabilidad única y se comunica con otros servicios a través de un API Gateway. Además, se utiliza un servidor de configuración central para una gestión unificada de la configuración.

## Arquitectura

La arquitectura incluye:

- **Eureka Server**: Registro y descubrimiento de servicios.
- **API Gateway**: Enrutamiento de peticiones.
- **Config Server**: Gestión centralizada de la configuración.
- **Microservicios de Curso y Estudiante**: Procesan datos específicos de cada entidad.

## Tecnologías

- **Spring Boot** - Desarrollo de microservicios
- **Spring Cloud** - Eureka, API Gateway, Config Server
- **Netflix Eureka** - Registro y descubrimiento de servicios
- **Spring Cloud Gateway** - Manejo de peticiones y balanceo de carga

## Instalación y Ejecución

1. Clona el repositorio:
   ```bash
   git clone https://github.com/ExeCarrizo33/spring-microservices.git
   cd spring-microservices
