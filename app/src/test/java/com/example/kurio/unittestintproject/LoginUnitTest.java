package com.example.kurio.unittestintproject;

import android.content.Context;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class LoginUnitTest {

    private String FAKE_STRING = "Login was successful";

    @Mock
    LoginView view;
    @Mock
    Context mMockContext;

    @Test
    public void readStringFromContext_LocalizedString() {
        LoginPresenter loginPresenter=new LoginPresenter(view,mMockContext);
//        LoginActivity myObjectUnderTest = new LoginActivity(mMockContext);
        // ...when the string is returned from the object under test...
        String result = loginPresenter.validate("user","user");

        // ...then the result should be the expected one.
        assertEquals(result, FAKE_STRING);
    }

}