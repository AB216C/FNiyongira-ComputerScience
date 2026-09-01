# Database/Dockerfile
FROM pgvector/pgvector:pg16

# COPY initialization SQL into the container
COPY ./initdb /docker-entrypoint-initdb.d

# EXPOSE default Postgres port
EXPOSE 5432