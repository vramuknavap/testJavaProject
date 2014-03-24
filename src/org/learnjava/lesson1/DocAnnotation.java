package org.learnjava.lesson1;

public @interface DocAnnotation {
	   String author();
	   String date();
	   int currentRevision() default 1;
	   String lastModified() default "N/A";
	   String lastModifiedBy() default "N/A";
	}

