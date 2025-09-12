#!/bin/bash

export LANG=ru_RU.UTF-8
export LC_ALL=ru_RU.UTF-8

clear
# echo "Введите число:"
# read num
# if (( num % 2 == 0 )); then
#     echo "$num — чётное"
# else
#     echo "$num — нечётное"
# fi
# read -p "Нажмите Enter для продолжения..."

java -Dfile.encoding=UTF-8 CheckingTheParity

read -p "Нажмите Enter для выхода..."
