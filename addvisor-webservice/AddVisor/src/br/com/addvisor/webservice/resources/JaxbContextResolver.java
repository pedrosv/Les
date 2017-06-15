package br.com.addvisor.webservice.resources;


import javax.ws.rs.ext.ContextResolver;
import javax.ws.rs.ext.Provider;
import javax.xml.bind.JAXBContext;

import br.com.addvisor.webservice.models.pojo.Address;
import br.com.addvisor.webservice.models.pojo.Agenda;
import br.com.addvisor.webservice.models.pojo.City;
import br.com.addvisor.webservice.models.pojo.Country;
import br.com.addvisor.webservice.models.pojo.Evaluate;
import br.com.addvisor.webservice.models.pojo.Service;
import br.com.addvisor.webservice.models.pojo.State;
import br.com.addvisor.webservice.models.pojo.User;
import br.com.addvisor.webservice.models.pojo.enums.ServiceCat;

import com.sun.jersey.api.json.JSONConfiguration;
import com.sun.jersey.api.json.JSONJAXBContext;

@Provider
public class JaxbContextResolver implements ContextResolver<JAXBContext> {

    private JAXBContext context;
    @SuppressWarnings("rawtypes")
	private Class[] types = {Service.class, Address.class, City.class, ServiceCat.class, Country.class, Evaluate.class, State.class, User.class, Agenda.class};

    public JaxbContextResolver() throws Exception {
        this.context = new JSONJAXBContext(JSONConfiguration.mapped().arrays("evaluates").arrays("evaluate").arrays("extraPhones").arrays("phones").arrays("service").arrays("services").build(), types);
    }

    @Override
    public JAXBContext getContext(Class<?> objectType) {
        return context;
    }
}
