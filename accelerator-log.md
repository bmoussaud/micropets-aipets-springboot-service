# Accelerator Log

## Options
```json
{
  "createResourceClaim" : true,
  "dbType" : "h2",
  "imageRegistry" : "akseutap5registry.azurecr.io",
  "petKind" : "Birdogs",
  "pkgName" : "org.moussaud.micropets.pets",
  "projectName" : "birdogs-ai-bizarre-service"
}
```
## Log
```
┏ engine (Chain)
┃  Info Running Chain(GeneratorValidationTransform, UniquePath)
┃ ┏ ┏ engine.transformations[0].validated (Combo)
┃ ┃ ┃  Info Combo running as Let
┃ ┃ ┃ engine.transformations[0].validated.delegate (Let)
┃ ┃ ┃ Debug Adding symbol devNamespace with value 'dev-tap'
┃ ┃ ┃ Debug Adding symbol resourcesNamespace with value 'database-instances-fr'
┃ ┃ ┃ Debug Adding symbol azureLocation with value 'francecentral'
┃ ┃ ┃ Debug Adding symbol lowerPluralPetKind with value 'birdogss'
┃ ┃ ┃ Debug Adding symbol kebabDbType with value 'h2'
┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in (Chain)
┃ ┃ ┃ ┃  Info Running Chain(Combo, Combo)
┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in.transformations[0] (Combo)
┃ ┃ ┃ ┃ ┃  Info Combo running as Chain
┃ ┃ ┃ ┃ ┃ engine.transformations[0].validated.delegate.in.transformations[0].delegate (Chain)
┃ ┃ ┃ ┃ ┃  Info Running Chain(Merge, UniquePath)
┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in.transformations[0].delegate.transformations[0] (Merge)
┃ ┃ ┃ ┃ ┃ ┃  Info Running Merge(Combo, Combo, Combo, Combo, Combo, Combo)
┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in.transformations[0].delegate.transformations[0].sources[0] (Combo)
┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Combo running as Include
┃ ┃ ┃ ┃ ┃ ┃ ┃ engine.transformations[0].validated.delegate.in.transformations[0].delegate.transformations[0].sources[0].delegate (Include)
┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Will include [.mvn/**, mvnw, mvnw.cmd]
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .gitignore didn't match [.mvn/**, mvnw, mvnw.cmd] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/MavenWrapperDownloader.java matched [.mvn/**, mvnw, mvnw.cmd] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.jar matched [.mvn/**, mvnw, mvnw.cmd] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.properties matched [.mvn/**, mvnw, mvnw.cmd] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .tanzuignore didn't match [.mvn/**, mvnw, mvnw.cmd] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug LICENSE didn't match [.mvn/**, mvnw, mvnw.cmd] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug Makefile didn't match [.mvn/**, mvnw, mvnw.cmd] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug README.md didn't match [.mvn/**, mvnw, mvnw.cmd] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug Tiltfile didn't match [.mvn/**, mvnw, mvnw.cmd] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug apply_workload.sh didn't match [.mvn/**, mvnw, mvnw.cmd] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug catalog-info.yaml didn't match [.mvn/**, mvnw, mvnw.cmd] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug clean.sh didn't match [.mvn/**, mvnw, mvnw.cmd] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug config/workload.yaml didn't match [.mvn/**, mvnw, mvnw.cmd] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug generate.json didn't match [.mvn/**, mvnw, mvnw.cmd] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug git-push.sh didn't match [.mvn/**, mvnw, mvnw.cmd] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug k8s/resources.yaml didn't match [.mvn/**, mvnw, mvnw.cmd] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw matched [.mvn/**, mvnw, mvnw.cmd] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw.cmd matched [.mvn/**, mvnw, mvnw.cmd] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug pet-silhouette-icons.png didn't match [.mvn/**, mvnw, mvnw.cmd] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug pom.xml didn't match [.mvn/**, mvnw, mvnw.cmd] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/renamethis/Application.java didn't match [.mvn/**, mvnw, mvnw.cmd] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/renamethis/PetKind.java didn't match [.mvn/**, mvnw, mvnw.cmd] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/renamethis/PetKindController.java didn't match [.mvn/**, mvnw, mvnw.cmd] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/renamethis/PetKindRepository.java didn't match [.mvn/**, mvnw, mvnw.cmd] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/renamethis/PetKindSummary.java didn't match [.mvn/**, mvnw, mvnw.cmd] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/META-INF/additional-spring-configuration-metadata.json didn't match [.mvn/**, mvnw, mvnw.cmd] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application-postgres.yml didn't match [.mvn/**, mvnw, mvnw.cmd] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application.yml didn't match [.mvn/**, mvnw, mvnw.cmd] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/schema-h2.sql didn't match [.mvn/**, mvnw, mvnw.cmd] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/schema-postgres.sql didn't match [.mvn/**, mvnw, mvnw.cmd] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug templates/azure-postgresql.yaml didn't match [.mvn/**, mvnw, mvnw.cmd] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┗ Debug templates/tanzu-postgresql.yaml didn't match [.mvn/**, mvnw, mvnw.cmd] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in.transformations[0].delegate.transformations[0].sources[1] (Combo)
┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Combo running as Chain
┃ ┃ ┃ ┃ ┃ ┃ ┃ engine.transformations[0].validated.delegate.in.transformations[0].delegate.transformations[0].sources[1].delegate (Chain)
┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Running Chain(Include, ReplaceText)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in.transformations[0].delegate.transformations[0].sources[1].delegate.transformations[0] (Include)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Will include [pom.xml]
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .gitignore didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/MavenWrapperDownloader.java didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.jar didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.properties didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .tanzuignore didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug LICENSE didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug Makefile didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug README.md didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug Tiltfile didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug apply_workload.sh didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug catalog-info.yaml didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug clean.sh didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug config/workload.yaml didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug generate.json didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug git-push.sh didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug k8s/resources.yaml didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw.cmd didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug pet-silhouette-icons.png didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug pom.xml matched [pom.xml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/renamethis/Application.java didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/renamethis/PetKind.java didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/renamethis/PetKindController.java didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/renamethis/PetKindRepository.java didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/renamethis/PetKindSummary.java didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/META-INF/additional-spring-configuration-metadata.json didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application-postgres.yml didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application.yml didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/schema-h2.sql didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/schema-postgres.sql didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug templates/azure-postgresql.yaml didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ Debug templates/tanzu-postgresql.yaml didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in.transformations[0].delegate.transformations[0].sources[1].delegate.transformations[1] (ReplaceText)
┃ ┃ ┃ ┃ ┃ ┃ ┗ ┗  Info Will replace [PetKind->Birdogs, my-petservice->birdogss, pkgName->org.moussaud.micrope...(truncated)]
┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in.transformations[0].delegate.transformations[0].sources[2] (Combo)
┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Combo running as Chain
┃ ┃ ┃ ┃ ┃ ┃ ┃ engine.transformations[0].validated.delegate.in.transformations[0].delegate.transformations[0].sources[2].delegate (Chain)
┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Running Chain(Include, ReplaceText)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in.transformations[0].delegate.transformations[0].sources[2].delegate.transformations[0] (Include)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Will include [config/**, .gitignore, .tanzuignore, README.md, apply_workload.sh, git-push.sh, clean.sh, Tiltfile, catalog-info.yaml, src/main/resources/schema-*.sql, src/main/resources/application.yml, src/main/resources/application-postgres.yml]
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .gitignore matched [config/**, .gitignore, .tanzuignore, README.md, apply_workload.sh, git-push.sh, clean.sh, Tiltfile, catalog-info.yaml, src/main/resources/schema-*.sql, src/main/resources/application.yml, src/main/resources/application-postgres.yml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/MavenWrapperDownloader.java didn't match [config/**, .gitignore, .tanzuignore, README.md, apply_workload.sh, git-push.sh, clean.sh, Tiltfile, catalog-info.yaml, src/main/resources/schema-*.sql, src/main/resources/application.yml, src/main/resources/application-postgres.yml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.jar didn't match [config/**, .gitignore, .tanzuignore, README.md, apply_workload.sh, git-push.sh, clean.sh, Tiltfile, catalog-info.yaml, src/main/resources/schema-*.sql, src/main/resources/application.yml, src/main/resources/application-postgres.yml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.properties didn't match [config/**, .gitignore, .tanzuignore, README.md, apply_workload.sh, git-push.sh, clean.sh, Tiltfile, catalog-info.yaml, src/main/resources/schema-*.sql, src/main/resources/application.yml, src/main/resources/application-postgres.yml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .tanzuignore matched [config/**, .gitignore, .tanzuignore, README.md, apply_workload.sh, git-push.sh, clean.sh, Tiltfile, catalog-info.yaml, src/main/resources/schema-*.sql, src/main/resources/application.yml, src/main/resources/application-postgres.yml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug LICENSE didn't match [config/**, .gitignore, .tanzuignore, README.md, apply_workload.sh, git-push.sh, clean.sh, Tiltfile, catalog-info.yaml, src/main/resources/schema-*.sql, src/main/resources/application.yml, src/main/resources/application-postgres.yml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug Makefile didn't match [config/**, .gitignore, .tanzuignore, README.md, apply_workload.sh, git-push.sh, clean.sh, Tiltfile, catalog-info.yaml, src/main/resources/schema-*.sql, src/main/resources/application.yml, src/main/resources/application-postgres.yml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug README.md matched [config/**, .gitignore, .tanzuignore, README.md, apply_workload.sh, git-push.sh, clean.sh, Tiltfile, catalog-info.yaml, src/main/resources/schema-*.sql, src/main/resources/application.yml, src/main/resources/application-postgres.yml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug Tiltfile matched [config/**, .gitignore, .tanzuignore, README.md, apply_workload.sh, git-push.sh, clean.sh, Tiltfile, catalog-info.yaml, src/main/resources/schema-*.sql, src/main/resources/application.yml, src/main/resources/application-postgres.yml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug apply_workload.sh matched [config/**, .gitignore, .tanzuignore, README.md, apply_workload.sh, git-push.sh, clean.sh, Tiltfile, catalog-info.yaml, src/main/resources/schema-*.sql, src/main/resources/application.yml, src/main/resources/application-postgres.yml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug catalog-info.yaml matched [config/**, .gitignore, .tanzuignore, README.md, apply_workload.sh, git-push.sh, clean.sh, Tiltfile, catalog-info.yaml, src/main/resources/schema-*.sql, src/main/resources/application.yml, src/main/resources/application-postgres.yml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug clean.sh matched [config/**, .gitignore, .tanzuignore, README.md, apply_workload.sh, git-push.sh, clean.sh, Tiltfile, catalog-info.yaml, src/main/resources/schema-*.sql, src/main/resources/application.yml, src/main/resources/application-postgres.yml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug config/workload.yaml matched [config/**, .gitignore, .tanzuignore, README.md, apply_workload.sh, git-push.sh, clean.sh, Tiltfile, catalog-info.yaml, src/main/resources/schema-*.sql, src/main/resources/application.yml, src/main/resources/application-postgres.yml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug generate.json didn't match [config/**, .gitignore, .tanzuignore, README.md, apply_workload.sh, git-push.sh, clean.sh, Tiltfile, catalog-info.yaml, src/main/resources/schema-*.sql, src/main/resources/application.yml, src/main/resources/application-postgres.yml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug git-push.sh matched [config/**, .gitignore, .tanzuignore, README.md, apply_workload.sh, git-push.sh, clean.sh, Tiltfile, catalog-info.yaml, src/main/resources/schema-*.sql, src/main/resources/application.yml, src/main/resources/application-postgres.yml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug k8s/resources.yaml didn't match [config/**, .gitignore, .tanzuignore, README.md, apply_workload.sh, git-push.sh, clean.sh, Tiltfile, catalog-info.yaml, src/main/resources/schema-*.sql, src/main/resources/application.yml, src/main/resources/application-postgres.yml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw didn't match [config/**, .gitignore, .tanzuignore, README.md, apply_workload.sh, git-push.sh, clean.sh, Tiltfile, catalog-info.yaml, src/main/resources/schema-*.sql, src/main/resources/application.yml, src/main/resources/application-postgres.yml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw.cmd didn't match [config/**, .gitignore, .tanzuignore, README.md, apply_workload.sh, git-push.sh, clean.sh, Tiltfile, catalog-info.yaml, src/main/resources/schema-*.sql, src/main/resources/application.yml, src/main/resources/application-postgres.yml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug pet-silhouette-icons.png didn't match [config/**, .gitignore, .tanzuignore, README.md, apply_workload.sh, git-push.sh, clean.sh, Tiltfile, catalog-info.yaml, src/main/resources/schema-*.sql, src/main/resources/application.yml, src/main/resources/application-postgres.yml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug pom.xml didn't match [config/**, .gitignore, .tanzuignore, README.md, apply_workload.sh, git-push.sh, clean.sh, Tiltfile, catalog-info.yaml, src/main/resources/schema-*.sql, src/main/resources/application.yml, src/main/resources/application-postgres.yml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/renamethis/Application.java didn't match [config/**, .gitignore, .tanzuignore, README.md, apply_workload.sh, git-push.sh, clean.sh, Tiltfile, catalog-info.yaml, src/main/resources/schema-*.sql, src/main/resources/application.yml, src/main/resources/application-postgres.yml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/renamethis/PetKind.java didn't match [config/**, .gitignore, .tanzuignore, README.md, apply_workload.sh, git-push.sh, clean.sh, Tiltfile, catalog-info.yaml, src/main/resources/schema-*.sql, src/main/resources/application.yml, src/main/resources/application-postgres.yml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/renamethis/PetKindController.java didn't match [config/**, .gitignore, .tanzuignore, README.md, apply_workload.sh, git-push.sh, clean.sh, Tiltfile, catalog-info.yaml, src/main/resources/schema-*.sql, src/main/resources/application.yml, src/main/resources/application-postgres.yml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/renamethis/PetKindRepository.java didn't match [config/**, .gitignore, .tanzuignore, README.md, apply_workload.sh, git-push.sh, clean.sh, Tiltfile, catalog-info.yaml, src/main/resources/schema-*.sql, src/main/resources/application.yml, src/main/resources/application-postgres.yml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/renamethis/PetKindSummary.java didn't match [config/**, .gitignore, .tanzuignore, README.md, apply_workload.sh, git-push.sh, clean.sh, Tiltfile, catalog-info.yaml, src/main/resources/schema-*.sql, src/main/resources/application.yml, src/main/resources/application-postgres.yml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/META-INF/additional-spring-configuration-metadata.json didn't match [config/**, .gitignore, .tanzuignore, README.md, apply_workload.sh, git-push.sh, clean.sh, Tiltfile, catalog-info.yaml, src/main/resources/schema-*.sql, src/main/resources/application.yml, src/main/resources/application-postgres.yml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application-postgres.yml matched [config/**, .gitignore, .tanzuignore, README.md, apply_workload.sh, git-push.sh, clean.sh, Tiltfile, catalog-info.yaml, src/main/resources/schema-*.sql, src/main/resources/application.yml, src/main/resources/application-postgres.yml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application.yml matched [config/**, .gitignore, .tanzuignore, README.md, apply_workload.sh, git-push.sh, clean.sh, Tiltfile, catalog-info.yaml, src/main/resources/schema-*.sql, src/main/resources/application.yml, src/main/resources/application-postgres.yml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/schema-h2.sql matched [config/**, .gitignore, .tanzuignore, README.md, apply_workload.sh, git-push.sh, clean.sh, Tiltfile, catalog-info.yaml, src/main/resources/schema-*.sql, src/main/resources/application.yml, src/main/resources/application-postgres.yml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/schema-postgres.sql matched [config/**, .gitignore, .tanzuignore, README.md, apply_workload.sh, git-push.sh, clean.sh, Tiltfile, catalog-info.yaml, src/main/resources/schema-*.sql, src/main/resources/application.yml, src/main/resources/application-postgres.yml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug templates/azure-postgresql.yaml didn't match [config/**, .gitignore, .tanzuignore, README.md, apply_workload.sh, git-push.sh, clean.sh, Tiltfile, catalog-info.yaml, src/main/resources/schema-*.sql, src/main/resources/application.yml, src/main/resources/application-postgres.yml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ Debug templates/tanzu-postgresql.yaml didn't match [config/**, .gitignore, .tanzuignore, README.md, apply_workload.sh, git-push.sh, clean.sh, Tiltfile, catalog-info.yaml, src/main/resources/schema-*.sql, src/main/resources/application.yml, src/main/resources/application-postgres.yml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in.transformations[0].delegate.transformations[0].sources[2].delegate.transformations[1] (ReplaceText)
┃ ┃ ┃ ┃ ┃ ┃ ┗ ┗  Info Will replace [PetKind->Birdogs, imageRegistry->akseutap5registry.az...(truncated), PET_KIND->Birdogs, my-petservice->birdogss, dbType->h2, lowercasePetKind->birdogss]
┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in.transformations[0].delegate.transformations[0].sources[3] (Combo)
┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Combo running as Chain
┃ ┃ ┃ ┃ ┃ ┃ ┃ engine.transformations[0].validated.delegate.in.transformations[0].delegate.transformations[0].sources[3].delegate (Chain)
┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Running Chain(Include, ReplaceText, OpenRewriteRecipe)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in.transformations[0].delegate.transformations[0].sources[3].delegate.transformations[0] (Include)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Will include [**/*.java]
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .gitignore didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/MavenWrapperDownloader.java matched [**/*.java] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.jar didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.properties didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .tanzuignore didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug LICENSE didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug Makefile didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug README.md didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug Tiltfile didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug apply_workload.sh didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug catalog-info.yaml didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug clean.sh didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug config/workload.yaml didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug generate.json didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug git-push.sh didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug k8s/resources.yaml didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw.cmd didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug pet-silhouette-icons.png didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug pom.xml didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/renamethis/Application.java matched [**/*.java] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/renamethis/PetKind.java matched [**/*.java] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/renamethis/PetKindController.java matched [**/*.java] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/renamethis/PetKindRepository.java matched [**/*.java] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/renamethis/PetKindSummary.java matched [**/*.java] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/META-INF/additional-spring-configuration-metadata.json didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application-postgres.yml didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application.yml didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/schema-h2.sql didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/schema-postgres.sql didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug templates/azure-postgresql.yaml didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ Debug templates/tanzu-postgresql.yaml didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in.transformations[0].delegate.transformations[0].sources[3].delegate.transformations[1] (ReplaceText)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗  Info Will replace [PetKind->Birdogs, lowercasePetKind->birdogss]
┃ ┃ ┃ ┃ ┃ ┃ ┗ ╺ engine.transformations[0].validated.delegate.in.transformations[0].delegate.transformations[0].sources[3].delegate.transformations[2] (OpenRewriteRecipe)
┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in.transformations[0].delegate.transformations[0].sources[4] (Combo)
┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Condition (#createResourceClaim && ( #dbType == 'azurePostgresql' ||#dbType == 'tanzuPostgresql') ) evaluated to false
┃ ┃ ┃ ┃ ┃ ┃ ┗ null ()
┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in.transformations[0].delegate.transformations[0].sources[5] (Combo)
┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Condition (#createResourceClaim && ( #dbType == 'azurePostgresql' ||#dbType == 'tanzuPostgresql') ) evaluated to false
┃ ┃ ┃ ┃ ┃ ┗ ┗ null ()
┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in.transformations[0].delegate.transformations[1] (UniquePath)
┃ ┃ ┃ ┃ ┗ ┗ Debug Multiple representations for path '.mvn/wrapper/MavenWrapperDownloader.java', will use the one appearing last 
┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in.transformations[1] (Combo)
┃ ┃ ┃ ┃ ┃  Info Combo running as Chain
┃ ┃ ┃ ┃ ┃ engine.transformations[0].validated.delegate.in.transformations[1].delegate (Chain)
┃ ┃ ┃ ┃ ┃  Info Running Chain(RewritePath)
┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in.transformations[1].delegate.transformations[0] (RewritePath)
┃ ┃ ┃ ┃ ┃ ┃ Debug Path 'src/main/java/org/moussaud/micropets/pets/PetKindController.java' matched '(.*)PetKind(.*)' with groups {g0=src/main/java/org/moussaud/micropets/pets/PetKindController.java, g1=src/main/java/org/moussaud/micropets/pets/, g2=Controller.java} and was rewritten to 'src/main/java/org/moussaud/micropets/pets/BirdogsController.java'
┃ ┃ ┃ ┃ ┃ ┃ Debug Path 'src/main/java/org/moussaud/micropets/pets/PetKindRepository.java' matched '(.*)PetKind(.*)' with groups {g0=src/main/java/org/moussaud/micropets/pets/PetKindRepository.java, g1=src/main/java/org/moussaud/micropets/pets/, g2=Repository.java} and was rewritten to 'src/main/java/org/moussaud/micropets/pets/BirdogsRepository.java'
┃ ┃ ┃ ┃ ┃ ┃ Debug Path 'src/main/java/org/moussaud/micropets/pets/PetKind.java' matched '(.*)PetKind(.*)' with groups {g0=src/main/java/org/moussaud/micropets/pets/PetKind.java, g1=src/main/java/org/moussaud/micropets/pets/, g2=.java} and was rewritten to 'src/main/java/org/moussaud/micropets/pets/Birdogs.java'
┃ ┗ ┗ ┗ ┗ ┗ Debug Path 'src/main/java/org/moussaud/micropets/pets/PetKindSummary.java' matched '(.*)PetKind(.*)' with groups {g0=src/main/java/org/moussaud/micropets/pets/PetKindSummary.java, g1=src/main/java/org/moussaud/micropets/pets/, g2=Summary.java} and was rewritten to 'src/main/java/org/moussaud/micropets/pets/BirdogsSummary.java'
┗ ╺ engine.transformations[1] (UniquePath)
```
