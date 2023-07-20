package base;

public enum PageLinksAndText {
    clickSettingCompanyLink("https://ps.contapp.ro/setari/general"),
    contactAppUrlLink("https://contapp.ro/"),
    verifyAssetsRegistryButtonLink("https://ps.contapp.ro/export/3850/assets/pdf/view?year=2023"),
    clickCreateAccountButtonLink("https://account.contapp.ro/register"),
    clickAuthenticationButtonLink("https://account.contapp.ro/login"),
    clickViewCart("https://shop.contapp.ro/cos"),
    clickCreateAccountButtonText("The url page  is not the expected one."),
    verifyAlertMessagesText("The alert messages are not the expected ones."),
    emailIncorectText("Email incorect!"),
    authenticationErrorMessage("Datele de autentificare introduse nu se potrivesc cu baza de date"),
    mandatoryEmailMessage("Campul \"E-mail\" este obligatoriu."),

    mandatoryPasswordMessage("Campul \"Parola\" este obligatoriu."),

    incomePageLink("https://ps.contapp.ro/venituri"),

    salesInvoicesLink("https://ps.contapp.ro/venituri/facturi"),

    eInvoicesLink("https://ps.contapp.ro/setari/integrari"),

    incomeArticlesLink("https://ps.contapp.ro/venituri/articole"),

    clientsLink("https://ps.contapp.ro/venituri/clienti"),
    textmessage("Mulțumim pentru părere");


    private final String value;

    PageLinksAndText(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}

