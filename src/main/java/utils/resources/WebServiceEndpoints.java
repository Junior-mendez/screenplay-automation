package utils.resources;

import utils.constants.Endpoints;

public enum WebServiceEndpoints {
    URI(Endpoints.URL_USERS);

    private final String url;

    WebServiceEndpoints(String url){
        this.url=url;
    }

    public String getUrl(){
        return url;
    }
}
