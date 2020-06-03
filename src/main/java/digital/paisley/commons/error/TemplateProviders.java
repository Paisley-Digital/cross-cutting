package digital.paisley.commons.error;

public class TemplateProviders {
    public static ExceptionTemplateProvider getDefaultProvider() {
        return new FileBaseTemplateProvider();
    }
}
