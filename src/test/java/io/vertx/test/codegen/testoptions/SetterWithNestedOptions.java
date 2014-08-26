package io.vertx.test.codegen.testoptions;

import io.vertx.codegen.annotations.Options;
import io.vertx.core.json.JsonObject;

/**
 * @author <a href="mailto:julien@julienviet.com">Julien Viet</a>
 */
@Options
public interface SetterWithNestedOptions {

  public static SetterWithNestedOptions options() {
    throw new UnsupportedOperationException();
  }

  public static SetterWithNestedOptions optionsFromJson(JsonObject obj) {
    throw new UnsupportedOperationException();
  }

  SetterWithNestedOptions setNested(Empty nested);

}
