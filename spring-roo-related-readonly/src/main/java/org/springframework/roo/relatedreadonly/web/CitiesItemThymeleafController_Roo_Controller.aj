// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package org.springframework.roo.relatedreadonly.web;

import org.springframework.roo.relatedreadonly.service.api.CityService;
import org.springframework.roo.relatedreadonly.web.CitiesItemThymeleafController;

privileged aspect CitiesItemThymeleafController_Roo_Controller {
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private CityService CitiesItemThymeleafController.cityService;
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return CityService
     */
    public CityService CitiesItemThymeleafController.getCityService() {
        return cityService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param cityService
     */
    public void CitiesItemThymeleafController.setCityService(CityService cityService) {
        this.cityService = cityService;
    }
    
}
