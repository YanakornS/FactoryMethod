class GetPlanFactory{  
      
   //use getPlan method to get object of type Plan   
       public Plan getPlan(String planType){  
            if(planType == null){  
             return null;  
            }  
          if(planType.equalsIgnoreCase("D")) {  
                 return new DomesticPlan();  
               }   
           else if(planType.equalsIgnoreCase("C")){  
                return new CommercialPlan();  
            }   
          else if(planType.equalsIgnoreCase("I")) {  
                return new InstitutionalPlan();  
          }  
      return null;  
   }  
}//end of GetPlanFactory class.  
