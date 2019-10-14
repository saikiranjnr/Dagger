package com.example.dagger.di;


import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import javax.inject.Scope;

@Scope
@Documented
@Retention(RUNTIME)
public @interface PerActivity {
}
