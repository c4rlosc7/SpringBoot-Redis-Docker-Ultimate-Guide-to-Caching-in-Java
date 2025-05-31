# SpringBoot-Redis-Docker-Ultimate-Guide-to-Caching-in-Java

What is Docker ?

[link](https://www.example.com/my%20great%20page)

What is Redis ?

How to install Redis in Docker 

```terminal
docker run --name my-redis -p 6379:6379 -d redis

or using docker compose

version: '3.8'

services:
  redis:
    image: redis:latest
    container_name: redis-server
    ports:
      - "6379:6379"
    volumes:
      - redis-data:/data

volumes:
  redis-data:
```

Run docker 

```
docker-compose up -d
```

[link](https://www.example.com/my%20great%20page)

What is Spring Boot ?

[link](https://www.example.com/my%20great%20page)
