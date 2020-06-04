FROM openjdk:8

# Install dependencies
RUN apt-get update
RUN apt-get install -y software-properties-common apt-utils apt-transport-https lsb-release ca-certificates wget

RUN wget -O /etc/apt/trusted.gpg.d/php.gpg https://packages.sury.org/php/apt.gpg
RUN echo "deb https://packages.sury.org/php/ $(lsb_release -sc) main" | tee /etc/apt/sources.list.d/php.list
RUN apt-get update
RUN apt-get install -y php7.3 git subversion perl
RUN apt-get install -y libdbi-perl patch bsdmainutils

# Clone defects4j dataset
RUN git clone https://github.com/rjust/defects4j /opt/runner/defects4j

WORKDIR /opt/runner/defects4j
RUN git checkout tags/v1.5.0

WORKDIR /
RUN bash -c /opt/runner/defects4j/init.sh
ENV PATH="${PATH}:/opt/runner/defects4j/framework/bin"
