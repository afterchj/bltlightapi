package com.tpadsz.after.api;

import java.util.List;

/**
 * Created by hongjian.chen on 2018/8/27.
 */
public interface RecordBillService<T> {

    T getByDeviceId(String deviceId);

    T getByLightUid(String light_uid);

    void insetBill(T htCharge);

    List<T> getChargeList(String uid);

    T getSumCharge(String uid);
}
