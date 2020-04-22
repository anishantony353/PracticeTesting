package com.anish.practicetesting;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import org.junit.Test;
import org.junit.runner.RunWith;


import androidx.test.runner.AndroidJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


@RunWith(AndroidJUnitRunner::class)
public class UtilTest {

    /*@Mock
    Context context;*/

    @Test
    public void shouldContainTheCorrectExtras()  throws Exception {
        Context context = mock(Context.class);
        Intent intent = Util.getIntent(context, "anish", "goregaon");
        assertNotNull(intent);
        Bundle extras = intent.getExtras();
        assertNotNull(extras);
        assertEquals("anish", extras.getString("NAME"));
        assertEquals("goregaon", extras.getString("ADDRESS"));
    }


}