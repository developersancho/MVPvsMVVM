package upday.mvpvsmvvm.datamodel;

import android.support.annotation.NonNull;

import rx.Observable;

public interface IDataModel {

    @NonNull
    Observable<String> getGreeting();

}
