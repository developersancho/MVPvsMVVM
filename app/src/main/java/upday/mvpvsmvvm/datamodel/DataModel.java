package upday.mvpvsmvvm.datamodel;

import android.support.annotation.NonNull;

import rx.Observable;

public class DataModel implements IDataModel {

    @NonNull
    @Override
    public Observable<String> getGreeting() {
        return Observable.just("Hello, World!");
    }
}
