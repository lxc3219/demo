package org.melody.demo.spring.injection.imports;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportSelector implements ImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata var1) {
        return new String[]{Person3.class.getName(), "org.melody.demo.project.injection.imports.Person4"};
    }
}
