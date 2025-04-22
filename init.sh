#!/bin/bash

# Espera o RabbitMQ subir completamente
sleep 10

# Cria o usuário "test" com senha "test"
rabbitmqctl add_user test test

# Dá permissões de administrador
rabbitmqctl set_user_tags test administrator

# Define permissões no vhost padrão "/"
rabbitmqctl set_permissions -p / test ".*" ".*" ".*"
