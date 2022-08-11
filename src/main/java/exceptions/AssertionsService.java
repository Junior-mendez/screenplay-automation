package exceptions;

public class AssertionsService extends AssertionError{

    private static final long serialVersionUID = 1L;
    public static final String THE_STATUS_CODE_SERVICE_IS_NOT_EXPECTED = "The status code service response is not expected";
    public static final String QUANTITY_SERVICE_IS_NOT_EXPECTED = "Quantity fields service is not expected";
    public static final String SCHEMA_SERVICE_IS_NOT_EXPECTED = "Schema service is not expected";
    public static final String THE_FIELDS_SERVICE_IS_NOT_EXPECTED = "Fields service is not expected";
    public static final String THE_FIELDS_AND_VALUES_SERVICE_IS_NOT_EXPECTED = "Fields and values service is not expected";
    public AssertionsService(String message, Throwable cause){
        super(message,cause);
    }
    public AssertionsService(String message){
        super(message);
    }
}
