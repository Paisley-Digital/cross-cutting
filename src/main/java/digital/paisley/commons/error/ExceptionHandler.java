package digital.paisley.commons.error;

public interface ExceptionHandler<T extends Throwable> {
    RestError getRestError(T throwable);
}
