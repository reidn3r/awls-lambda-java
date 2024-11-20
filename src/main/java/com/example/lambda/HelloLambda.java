package com.example.lambda;

import com.amazonaws.services.lambda.runtime.Context;

public class HelloLambda {
    public String handlerLambda(Object input, Context context){
        return "Hello, World";
    }
}