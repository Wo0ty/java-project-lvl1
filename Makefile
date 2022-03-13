.PHONY: build

install:	# очистка результатов предыдущей сборки и запуск новой
	./gradlew clean install
lint:	# проверка стиля кода
	./gradlew checkstyleMain
check-updates:	# проверка обновления зависимостей и плагинов
	./gradlew dependencyUpdates
build:	# сборка проекта
	./gradlew clean build
run-dist:	# запуск исполняемого файла
	./build/install/app/bin/app