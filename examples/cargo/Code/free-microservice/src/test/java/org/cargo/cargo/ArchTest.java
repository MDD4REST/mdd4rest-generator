package org.cargo.cargo;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.core.importer.ImportOption;
import org.junit.jupiter.api.Test;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;

class ArchTest {

    @Test
    void servicesAndRepositoriesShouldNotDependOnWebLayer() {

        JavaClasses importedClasses = new ClassFileImporter()
            .withImportOption(ImportOption.Predefined.DO_NOT_INCLUDE_TESTS)
            .importPackages("org.cargo.cargo");

        noClasses()
            .that()
                .resideInAnyPackage("org.cargo.cargo.service..")
            .or()
                .resideInAnyPackage("org.cargo.cargo.repository..")
            .should().dependOnClassesThat()
                .resideInAnyPackage("..org.cargo.cargo.web..")
        .because("Services and repositories should not depend on web layer")
        .check(importedClasses);
    }
}
