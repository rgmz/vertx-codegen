package io.vertx.test.codegen.testdataobject.annotations;

/**
 * @author <a href="mailto:cafeinoman@openaliasbox.org>Francois Delalleau</a>
 */
public @interface StringValuedAnnotation {

  String value();

  String[] array();

  String defaultValue() default "defaultString";

}
