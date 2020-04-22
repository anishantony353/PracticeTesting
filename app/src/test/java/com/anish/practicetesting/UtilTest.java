package com.anish.practicetesting;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import org.mockito.runners.MockitoJUnitRunner;
import org.robolectric.RobolectricTestRunner;

import androidx.test.core.app.ApplicationProvider;

@RunWith(RobolectricTestRunner.class)
public class UtilTest {



    @Test
    public void shouldContainTheCorrectExtras()  throws Exception {
        Context context = ApplicationProvider.getApplicationContext();

        Intent intent = Util.getIntent(context, "anish", "goregaon");
        assertNotNull(intent);
        Bundle extras = intent.getExtras();
        assertNotNull(extras);
        assertEquals("anish", extras.getString("NAME"));
        assertEquals("goregaon", extras.getString("ADDRESS"));



    }


}