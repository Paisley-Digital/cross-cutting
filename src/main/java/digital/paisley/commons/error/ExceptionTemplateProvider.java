package digital.paisley.commons.error;

import java.util.Map;

public interface ExceptionTemplateProvider {
    ExceptionTemplate[] getTemplates();

    Map<String, RestError> getExceptionMappings();
}
