package com.example.nationalparks.data;


import com.example.nationalparks.model.Park;

import java.util.List;

public interface AsyncResponse {
    void processPark(List<Park> parks);
}
