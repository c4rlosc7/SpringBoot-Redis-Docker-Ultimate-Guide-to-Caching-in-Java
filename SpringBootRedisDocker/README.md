
## Database `Product`

```db
create table product (
    price numeric(38,2),
    id bigint not null,
    name varchar(255),
    primary key (id)
)
```


#spring.application.name=SpringBootRedisDocker

#spring.application.name=spring-boot-redis-cache

#spring.datasource.url=jdbc:h2:mem:testdb
#spring.datasource.driverClassName=org.h2.Driver
#spring.datasource.username=sa
#spring.datasource.password=password
#spring.h2.console.enabled=true
#spring.jpa.database-platform=org.hibernate.dialect.H2Dialect

#spring.jpa.show-sql=true
#spring.jpa.properties.hibernate.format_sql=true

#spring.cache.type=redis
#spring.data.redis.host=localhost
#spring.data.redis.port=6379

# if we are using local redis or cloud but here we use docker so there is no need of username or password
#spring.data.redis.username=
#spring.data.redis.password=

## redis-cli

```cmd
> docker exec -it bcb6e93a18931542a0462b017c5537dc43182081f9eb0355250879283d7227ef redis-cli
```

## Actuator

- http://localhost:8080/actuator
- http://localhost:8080/actuator/health
- http://localhost:8080/actuator/metrics
- http://localhost:8080/actuator/info

