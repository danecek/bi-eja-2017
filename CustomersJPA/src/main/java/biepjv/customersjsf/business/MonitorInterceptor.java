/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biepjv.customersjsf.business;

import java.util.Arrays;
import java.util.logging.Logger;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Interceptor @FacadeBinder
public class MonitorInterceptor {
    
    @AroundInvoke
    public Object monitor(InvocationContext ic) throws Exception {
    //    LOG.info(ic.getMethod() + ":" + Arrays.toString(ic.getParameters()));
        return ic.proceed();
    }
    private static final Logger LOG = Logger.getLogger(MonitorInterceptor.class.getName());

}
