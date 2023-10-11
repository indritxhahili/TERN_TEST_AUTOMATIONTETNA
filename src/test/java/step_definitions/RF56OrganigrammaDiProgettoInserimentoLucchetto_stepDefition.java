package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.ClickOK_Page;
import pages.RF56OrganigrammaDiProgettoInserimentoLucchetto_Page;
import utilitiess.ConfigurationReader;
import utilitiess.Driver;

public class RF56OrganigrammaDiProgettoInserimentoLucchetto_stepDefition {
    int sleep =  (ConfigurationReader.getPropertyInt("Time_Sleep"));
    ClickOK_Page clickOK_page = new ClickOK_Page();
    RF56OrganigrammaDiProgettoInserimentoLucchetto_Page rf56OrganigrammaDiProgettoInserimentoLucchetto_page = new RF56OrganigrammaDiProgettoInserimentoLucchetto_Page();
   /* @Given("Lutente  inserisce usernamext3533  password M1k1am0?glce clicca sul bottone Log In")
    public void lutente_inserisce_usernamext3533_password_m1k1am0_glce_clicca_sul_bottone_log_in() throws InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperty("Terna"));
        try {
            Thread.sleep(sleep);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickOK_page.clickOk.click();
        Thread.sleep(sleep);
        rf56OrganigrammaDiProgettoInserimentoLucchetto_page.CLickUsername.sendKeys("xt3533");
        try {
            Thread.sleep(sleep);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        rf56OrganigrammaDiProgettoInserimentoLucchetto_page.ClickPassword.sendKeys("M1k1am0?glc");
    }
    @Then("Lutente  clicca sulpannello Project  Configurator")
    public void lutente_clicca_sulpannello_project_configurator() throws InterruptedException {
        Thread.sleep(sleep);
        rf56OrganigrammaDiProgettoInserimentoLucchetto_page.ClickLogin.click();
        if(!rf56OrganigrammaDiProgettoInserimentoLucchetto_page.prijectConfigClick.isEnabled()){
            System.out.println("Step one failed");
        }else {
            System.out.println("Step one passed");
            try {
                Thread.sleep(sleep);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            rf56OrganigrammaDiProgettoInserimentoLucchetto_page.prijectConfigClick.click();
        }
    }

    */
    @Then("Lutente  selezionaorganizzazione  SSD-RIT-REI-ARI Cagliari")
    public void lutente_selezionaorganizzazione_ssd_rit_rei_ari_cagliari() throws InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperty("Terna"));
        Thread.sleep(sleep);
        rf56OrganigrammaDiProgettoInserimentoLucchetto_page.prijectConfigClick.click();
        Thread.sleep(sleep);
        rf56OrganigrammaDiProgettoInserimentoLucchetto_page.SelezionaUNorganizzazioneDropDown.click();
        try {
            Thread.sleep(sleep);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Then("Lutente  seleziona laWBS TE-ER-{int}-{int}-Reattore {int} kV SE Roma Est e clicca la freccia a destra")
    public void lutente_seleziona_la_wbs_te_er_reattore_k_v_se_roma_est_e_clicca_la_freccia_a_destra(Integer int1, Integer int2, Integer int3) {
        if(!rf56OrganigrammaDiProgettoInserimentoLucchetto_page.SelezionaCagliari.isEnabled()){
            System.out.println("Step three failed");
        }else {
            System.out.println("Step three passed");
            try {
                Thread.sleep(sleep);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            rf56OrganigrammaDiProgettoInserimentoLucchetto_page.SelezionaCagliari.click();
        }
        if(!rf56OrganigrammaDiProgettoInserimentoLucchetto_page.SelezionaUNAWBS.isEnabled()){
            System.out.println("Step 4 failed");
        }else {
            System.out.println("Step 4 passed");
            try {
                Thread.sleep(sleep);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            rf56OrganigrammaDiProgettoInserimentoLucchetto_page.SelezionaUNAWBS.click();
        }
        if(!rf56OrganigrammaDiProgettoInserimentoLucchetto_page.clickDropDownRomaEast.isEnabled()){
            System.out.println("Step 4 failed");
        }else {
            System.out.println("Step 4 passed");
            try {
                Thread.sleep(sleep);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            rf56OrganigrammaDiProgettoInserimentoLucchetto_page.clickDropDownRomaEast.click();
        }
        rf56OrganigrammaDiProgettoInserimentoLucchetto_page.clickFrecetaDestra.click();
        try {
            Thread.sleep(sleep);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Then("L'utente clicca sulla voce  {string}")
    public void l_utente_clicca_sulla_voce(String string) {
     rf56OrganigrammaDiProgettoInserimentoLucchetto_page.OrganigrammaDiProgetto.click();
        try {
            Thread.sleep(sleep);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Driver.closeDriver();
    }

}
