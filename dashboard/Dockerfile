FROM php:7.3-apache

# Add dependencies
RUN apt-get update
RUN apt-get install -y vim zip
RUN apt-get install -y \
        apt-utils \
        libfreetype6-dev \
        libjpeg62-turbo-dev \
        libpng-dev \
        libzip-dev

# Install needed php plugins
RUN docker-php-ext-install pdo_mysql gd zip

# Copy source code
COPY . /var/www/html

# Allow apache rewrites
RUN a2enmod rewrite

# Entrypoint
EXPOSE 80
