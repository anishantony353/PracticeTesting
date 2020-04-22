package com.anish.practicetesting.api_testing;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.MockitoRule;
import org.robolectric.RobolectricTestRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.when;

public class ServiceUserTest {

    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();

    @Mock
    ApiService apiService;

    ServiceUser serviceUser;

    @Before
    public void init(){
        serviceUser = new ServiceUser();
        serviceUser.apiService = apiService;
    }

    @Test
    public void test_gettingMessageFromApi(){
        String mocked_msg = "Mocked msg";
        when(apiService.getMessage()).thenReturn(mocked_msg);

        assertEquals(mocked_msg,serviceUser.getMessage());

        verify(apiService,times(1)).getMessage();
        verifyNoMoreInteractions(apiService);

        /*verify(apiService,never()).pushMessage(Mockito.anyString());*/


    }

}