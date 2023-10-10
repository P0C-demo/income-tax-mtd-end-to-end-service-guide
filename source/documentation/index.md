# Income Tax (Making Tax Digital) end-to-end service guide

**Version X.Y** experimental version

This service guide explains how you can integrate your software with the [Income Tax (Making Tax Digital) APIs](https://developer.service.hmrc.gov.uk/api-documentation/docs/api?filter=income-tax). 




>|Help us improve this guide |
|---|  
|This guide is currently being revised and overhauled to ensure it meets the needs of software providers. See the service guide [changelog](#changelog) for latest updates.<br/><br/>If there is a way that this guide could be improved or expanded to meet your needs, <b>now is the time to let us know.</b><br/><br/>If you use this guide regularly, we&#39;d like to invite you to share your thoughts and feedback via an online video call, which will involve a 60-minute one-to-one interview.<br/><br/>We’d like to explore:<ul><li>Your current use of and experience with the service guide</li><li>Any challenges you face</li><li>How helpful you find the service guide</li><li>Your thoughts on the current service guide, how it fits your needs and how it can be improved</li></ul><br/>If you would like to help us improve this guide, please contact our User Researcher <a href="mailto:sofia.pereira@digital.hmrc.gov.uk">sofia.pereira@digital.hmrc.gov.uk</a> to arrange an interview.|



## Changelogs

### API changelog

The full changelog for Income Tax MTD APIs is now at [https://github.com/hmrc/income-tax-mtd-changelog](https://github.com/hmrc/income-tax-mtd-changelog) - that is the best source for detailed and comprehensive information about API changes.

### Documentation changelog

Below is a summary of significant updates to this service guide:

#### Version 3.1

* Added 'API lifecycle & deprecation' section, removed some duplicated content.

#### Version 3.0

* Updated API and endpoint links.

#### Version 2.9

* Updated direct links to endpoints to reflect changes in how API documentation is published.

#### Version 2.8

* Updated HMRC Assist section.

#### Version 2.7

* Updated guide to reflect simplified v3.0 Final Declaration process and update section on customers opting out of MTD. 

#### Version 2.6

* Updated guide to reflect API changes including refactored Self Assessment Accounts API.

#### Version 2.5

* Updated guide to reflect new API versions, update links and correct and clarify some content.

#### Version 2.4

* Updated Frequently Asked Questions section to remove some items.

#### Version 2.3

* Added note and an example table demonstrating how adjustments submitted work.

#### Version 2.2

* Added a Frequently Asked Questions section to the menu tree.

#### Version 2.1

* Notice of version change to Business Income Source Summary V1.0
* "Set up" heading replaced by "Sign up" with the menu tree updated to only have three sections: **Agent**, **Individual** and **Link software to HMRC**.
* Updated content in the **Minimum functionality standards** section with two other sections added: **Bridging software** and **Non-MTD products**.
* Updated content in the **Declaration** and **Declaration for agents** sections of **Final declaration** (previously called "crystallisation").

#### Version 2.0

* Addition of Capital Gains Tax, Marriage Allowance, Non-PAYE Income, Coding out underpayments and debts.

#### Version 1.9

* Addition of requirement for businesses and landlords to provide information about residential property disposals.
* Addition of information regarding BSAS adjustments.
* Addition of content changes to meet MTD Style Guide V2.2.
* Replacing the term ‘crystallisation’ with ‘final declaration'.

#### Version 1.8

* Addition of deprecation dates for Self Assessment API Endpoints.
* Notice of version change to Business Source Adjustable Summary (MTD) - V 1.0.
* Notice of version change to Individual Losses (MTD) - V1.0.
* Notice of version change to Individual Calculations v 1.0.

#### Version 1.7

* Change of title to Income Tax (Making Tax Digital) end-to-end Service Guide.
* Inclusion of Income Tax (MTD) APIs.
* Inclusion of Tax Terminology.
* Addition of Foreign Property reference to Obligations.
* Replaced the term, ‘taxpayers’ with ‘customers’.
* Replaced references to SA Accounting Summary API with BSAS API.

#### Version 1.6

* Revised wording for Draft MTD ITSA Regulations 2021 page.

#### Version 1.5

* Production approvals process for Making Tax Digital for Self Assessment.
* Early draft MTD ITSA Regulations 2021 section added.

#### Version 1.4

* Construction Industry Scheme (CIS) section updated.

#### Version 1.3

* Losses updated.
* Additional income section added.

#### Version 1.2

* Multiple businesses section added.
* Construction Industry Scheme (CIS) section added.

#### Version 1.1

* Payments and Liabilities section added.
