FROM adoptopenjdk/openjdk11:jdk-11.0.6_10

COPY target/core/ /app
RUN chmod 500 /app/bin/*
WORKDIR /app/bin

RUN apt-get update -y && \
    apt-get install -y curl dos2unix && \
    DEBIAN_FRONTEND="noninteractive" apt-get -y install tzdata && \
    apt-get autoremove --purge -y && \
    apt-get clean && \
    rm -rf /var/lib/apt/lists/*

CMD ["sh", "core", "console"]

EXPOSE 10000