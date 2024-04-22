# Overview of the service guide

> **Warning:** This is not an official HMRC document. It is a prototype document for discussion within HMRC.

**Version 3.9** issued March 2024

This service guide explains how you can integrate your software with the [Income Tax (Making Tax Digital) APIs](/api-documentation/docs/api?filter=income-tax-mtd).

>|Help us improve this guide |
|---|
|This guide is currently being revised and overhauled to ensure it meets the needs of software providers. See the service guide [changelog](#documentation-changelog) for latest updates.<br/><br/>If there is a way that this guide could be improved or expanded to meet your needs, <b>now is the time to let us know.</b><br/><br/>If you use this guide regularly, we&#39;d like to invite you to share your thoughts and feedback via an online video call, which will involve a 60-minute one-to-one interview.<br/><br/>We’d like to explore:<ul><li>Your current use of and experience with the service guide</li><li>Any challenges you face</li><li>How helpful you find the service guide</li><li>Your thoughts on the current service guide, how it fits your needs and how it can be improved</li></ul><br/>|

## Overview

This guide explains how you can integrate your software with our APIs, and provides examples of how they fit into various end-to-end user journeys to enable agents and individuals to meet their obligations after they have signed up to Making Tax Digital, a service where quarterly updates and final declarations will replace the need for a Self Assessment return to be submitted.

For more information about eligibility and how to use Making Tax Digital for Income Tax, refer to [Making Tax Digital step by step guidance](https://www.gov.uk/government/collections/making-tax-digital-for-income-tax-for-businesses-step-by-step).

## Software provider overview

HMRC expects software providers to offer customers a streamlined end-to-end journey, and as far as possible, to support all the things the customers need to do to comply with their MTD for ITSA obligations. This will include the ability to finalise the overall tax position using software.

HMRC will provide the APIs for the software to support all of the personal data items that need to be submitted under Self Assessment. Although these elements will not be mandated through the software, there will be market demand for software that enables any user to finalise the entirety of their tax affairs.

By developing a product now, you will support the mandate of the service, influence its design and ensure you have a product ready for the millions of customers that will need MTD-compatible software.

### Bridging software

Some customers may wish to integrate their existing software solution for digital record keeping with another product that can submit quarterly updates, End of Period Statement, view tax liabilities, make a self assessment and final declaration, and so on. We generally refer to these products as bridging products. 

To be granted production credentials for a bridging product, it must be digitally linked to software that allows customers to maintain business records required by law.

### Non-MTD products

Software products who wish to selectively use Making Tax Digital for Income Tax APIs and not build a Making Tax Digital product will have to submit a business case, justifying use of a particular or multiple API’s. Such products may be granted production credentials at HMRC discretion.

## How to use this guide

(Content needed)

## Mapping APIs to Self Assessment tax return forms

Many parameters in some Income Tax (Making Tax Digital) APIs map to box numbers in [Self Assessment tax return forms (GOV.UK)](https://www.gov.uk/self-assessment-tax-return-forms). You can download this mapping information as CSV files from the [income-tax-mtd-changelog/mapping](https://github.com/hmrc/income-tax-mtd-changelog?tab=readme-ov-file#mapping-apis-to-self-assessment-tax-return-forms) (GitHub).

Some APIs map to box numbers in more than one form. The following table shows which APIs are linked to which forms. 

| Self Assessment tax return form                              | Related APIs                                                 |
| ------------------------------------------------------------ | ------------------------------------------------------------ |
| [SA100 Main tax return (GOV.UK)](https://www.gov.uk/government/publications/self-assessment-tax-return-sa100) | [Individual Calculations](/api-documentation/docs/api/service/individual-calculations-api) <br />[Individuals Disclosures](/api-documentation/docs/api/service/individuals-disclosures-api) <br />[Individuals Income Received](/api-documentation/docs/api/service/individuals-income-received-api) <br />[Individuals Reliefs](/api-documentation/docs/api/service/individuals-reliefs-api) <br />[Individuals State Benefits](/api-documentation/docs/api/service/individuals-state-benefits-api) <br />[Self Assessment Accounts](/api-documentation/docs/api/service/self-assessment-accounts-api) |
| [SA101 Additional Information (GOV.UK)](https://www.gov.uk/government/publications/self-assessment-additional-information-sa101) | [Individuals Charges](/api-documentation/docs/api/service/individuals-charges-api) <br />[Individuals Disclosures](/api-documentation/docs/api/service/individuals-disclosures-api) <br />[Individuals Expenses](/api-documentation/docs/api/service/individuals-expenses-api) <br />[Individuals Income Received](/api-documentation/docs/api/service/individuals-income-received-api) <br />[Individuals Reliefs](/api-documentation/docs/api/service/individuals-reliefs-api) <br />[Other Deductions](/api-documentation/docs/api/service/other-deductions-api) |
| [SA102 Employment (GOV.UK)](https://www.gov.uk/government/publications/self-assessment-employment-sa102) | [Individuals Expenses](/api-documentation/docs/api/service/individuals-expenses-api) <br />[Individuals Income Received](/api-documentation/docs/api/service/individuals-income-received-api) |
| [SA105 UK Property (GOV.UK)](https://www.gov.uk/government/publications/self-assessment-uk-property-sa105) | [Individual Losses](/api-documentation/docs/api/service/individual-losses-api) <br />[Property Business](/api-documentation/docs/api/service/property-business-api) |
| [SA106 Foreign (GOV.UK)](https://www.gov.uk/government/publications/self-assessment-foreign-sa106) | [Individual Losses](/api-documentation/docs/api/service/individual-losses-api) <br />[Individuals Income Received](/api-documentation/docs/api/service/individuals-income-received-api) <br />[Individuals Reliefs](/api-documentation/docs/api/service/individuals-reliefs-api) <br />[Property Business](/api-documentation/docs/api/service/property-business-api) |

## Changelogs

### API changelog

The [income-tax-mtd-changelog](https://github.com/hmrc/income-tax-mtd-changelog) (GitHub) provides detailed and comprehensive information about API changes.

### Documentation changelog

Below is a summary of updates to this service guide.

#### Version 3.9

18 March 2024

- Update [Business and property income](/guides/income-tax-mtd-end-to-end-service-guide/documentation/business-and-property-income.html) section:
  - add new section [Change to calendar quarters](/guides/income-tax-mtd-end-to-end-service-guide/documentation/business-and-property-income.html#change-to-calendar-quarters)
  - add new content to section [Submit quarterly update](/guides/income-tax-mtd-end-to-end-service-guide/documentation/business-and-property-income.html#submit-quarterly-update)
- Update [Final declaration](/guides/income-tax-mtd-end-to-end-service-guide/documentation/final-declaration.html) section:
  - remove all references to ‘crystallisation’
  - remove sections ‘Calculations that produce errors’ and ‘Calculations that are free from errors’, which are now in section [Tax calculation](/guides/income-tax-mtd-end-to-end-service-guide/documentation/business-and-property-income.html#tax-calculation)
  - change ’calcuationId' to 'Calculation ID' and 'finalDeclaraton' to 'Final Declaration'
  - update tax account links in section [Pay or get a repayment](/guides/income-tax-mtd-end-to-end-service-guide/documentation/final-declaration.html#pay-or-get-a-repayment)
- Update [HMRC online services](/guides/income-tax-mtd-end-to-end-service-guide/documentation/online-tax-account.html) section:
  - update status of ‘Elect for calendar quarterly periods’ task
  - add new table column that explains choice of service (HMRC online services or software or both) used to make each functionality available
- Update [Using tax codes to collect tax due](/guides/income-tax-mtd-end-to-end-service-guide/documentation/using-tax-codes-to-collect-taxes-due.html) section (formerly ‘Coding Out’):
  - retitle section
  - rewrite section
  - add content about opting out

#### Version 3.8

31 January 2024

- Update [Deprecating APIs](/guides/income-tax-mtd-end-to-end-service-guide/documentation/api-deprecation-guidance.html#deprecating-apis) section with details about new deprecation headers
- Update the following section of [Business and property income](/guides/income-tax-mtd-end-to-end-service-guide/documentation/business-and-property-income.html) section:

  - [Tax calculation](/guides/income-tax-mtd-end-to-end-service-guide/documentation/business-and-property-income.html#tax-calculation) (formerly 'Retrieve a tax calculation')

- Update the following sections of [Additional information](/guides/income-tax-mtd-end-to-end-service-guide/documentation/additional-information.html) section (formerly 'Additional Income'):

  - New section introduction for Additional Information (remove ‘Submit information about personal income’)
  - [Employments](/guides/income-tax-mtd-end-to-end-service-guide/documentation/additional-information.html#employments) (move some content to new section ‘Employment Expenses’)
  - [Dividends Income](/guides/income-tax-mtd-end-to-end-service-guide/documentation/additional-information.html#dividends-income)
  - [Pensions Income](/guides/income-tax-mtd-end-to-end-service-guide/documentation/additional-information.html#pensions-income)
  - [Other Income](/guides/income-tax-mtd-end-to-end-service-guide/documentation/additional-information.html#other-income)
  - [Savings Income](/guides/income-tax-mtd-end-to-end-service-guide/documentation/additional-information.html#savings-income)
  - [Savings Accounts](/guides/income-tax-mtd-end-to-end-service-guide/documentation/additional-information.html#savings-accounts)
  - [Disclosures](/guides/income-tax-mtd-end-to-end-service-guide/documentation/additional-information.html#disclosures)
  - [Individual Charges](/guides/income-tax-mtd-end-to-end-service-guide/documentation/additional-information.html#individual-charges) (formerly 'Pension Charges')
  - [Individual Reliefs](/guides/income-tax-mtd-end-to-end-service-guide/documentation/additional-information.html#individual-reliefs)
  - [Other Deductions](/guides/income-tax-mtd-end-to-end-service-guide/documentation/additional-information.html#other-deductions)
  - [Employment Expenses](/guides/income-tax-mtd-end-to-end-service-guide/documentation/additional-information.html#employment-expenses) (formerly ‘Individual Expenses Other’)
  - [Non-PAYE Income](/guides/income-tax-mtd-end-to-end-service-guide/documentation/additional-information.html#non-paye-income)
  - [State Benefits](/guides/income-tax-mtd-end-to-end-service-guide/documentation/additional-information.html#state-benefits)
  - [Providing information about how to treat a loss](/guides/income-tax-mtd-end-to-end-service-guide/documentation/additional-information.html#providing-information-about-how-to-treat-a-loss)

#### Version 3.7

24 January 2024

- Update the following sections of [Business and property income](/guides/income-tax-mtd-end-to-end-service-guide/documentation/business-and-property-income.html) section:

  - [Retrieving obligations](/guides/income-tax-mtd-end-to-end-service-guide/documentation/business-and-property-income.html#retrieving-obligations)
  - [Submit quarterly updates for self-employment and property businesses](/guides/income-tax-mtd-end-to-end-service-guide/documentation/business-and-property-income.html#submit-quarterly-updates-for-self-employment-and-property-businesses)
  - [Submit annual updates for self-employment and property businesses](/guides/income-tax-mtd-end-to-end-service-guide/documentation/business-and-property-income.html#submit-annual-updates-for-self-employment-and-property-businesses)
  - [Submit accounting adjustments](/guides/income-tax-mtd-end-to-end-service-guide/documentation/business-and-property-income.html#submit-accounting-adjustments)
  - [Construction Industry Scheme](/guides/income-tax-mtd-end-to-end-service-guide/documentation/business-and-property-income.html#construction-industry-scheme)
  - [Finalise business income End of Period Statement (EOPS)](/guides/income-tax-mtd-end-to-end-service-guide/documentation/business-and-property-income.html#finalise-business-income-end-of-period-statement-eops)
  - [Tax calculation](/guides/income-tax-mtd-end-to-end-service-guide/documentation/business-and-property-income.html#tax-calculation) (formerly 'Retrieve a tax calculation')

- Move the content of the following sections to other sections in Business and Property Income section:

  -  Business Income Source Summary
  -  View previously submitted updates
  -  Making changes to previously submitted data
  -  Multiple businesses

- Update the [HMRC online services](/guides/income-tax-mtd-end-to-end-service-guide/documentation/online-tax-account.html) section as follows:

  - update status of 2 tasks
  - move [Opting out of MTD](/guides/income-tax-mtd-end-to-end-service-guide/documentation/online-tax-account.html#opting-out-of-mtd) section into HMRC online services section

- Update the following sections of [Additional information](/guides/income-tax-mtd-end-to-end-service-guide/documentation/additional-information.html) section:

  - [Foreign Income](/guides/income-tax-mtd-end-to-end-service-guide/documentation/additional-information.html#foreign-income)
  - [Insurance Policies Income](/guides/income-tax-mtd-end-to-end-service-guide/documentation/additional-information.html#insurance-policies-income)
  - [Capital Gains Tax](/guides/income-tax-mtd-end-to-end-service-guide/documentation/additional-information.html#capital-gains-tax)
  - [Marriage Allowance](/guides/income-tax-mtd-end-to-end-service-guide/documentation/additional-information.html#marriage-allowance)

#### Version 3.6

13 December 2023

* Update [Additional information / Employments](/guides/income-tax-mtd-end-to-end-service-guide/documentation/additional-information.html#employments) section with off-payroll working details
* Update [Customer support model](/guides/income-tax-mtd-end-to-end-service-guide/documentation/customer-support.html) section
* Update [Using tax codes to collect tax due](/guides/income-tax-mtd-end-to-end-service-guide/documentation/using-tax-codes-to-collect-taxes-due.html) section (formerly 'Coding Out')
* Update UR contact email address

#### Version 3.5

15 November 2023

* Update content and diagram in [Payments and liabilities](/guides/income-tax-mtd-end-to-end-service-guide/documentation/payments-and-liabilities.html) section
* Remove crystallisation endpoint content from [Final declaration](/guides/income-tax-mtd-end-to-end-service-guide/documentation/final-declaration.html) section

#### Version 3.4

2 November 2023

* Add new [Customer status](/guides/income-tax-mtd-end-to-end-service-guide/documentation/customer-status.html) section describing business purpose of the new Self Assessment Individual Details API
* Update [Construction Industry Scheme](/guides/income-tax-mtd-end-to-end-service-guide/documentation/business-and-property-income.html#construction-industry-scheme) section and move it into 'Business and Property Income' section
* Update [Software choices](#software-choices) section
* Update APIs in [Minimum functionality standards](#minimum-functionality-standards) section
* Remove duplicate 'Finalise business income End of Period Statement (EOPS)' section

#### Version 3.3

4 October 2023

* Update content for [HMRC online services](/guides/income-tax-mtd-end-to-end-service-guide/documentation/online-tax-account.html) section
* Update content for [Opting out of MTD](/guides/income-tax-mtd-end-to-end-service-guide/documentation/closedown.html) section
* Update content for [HMRC Assist](/guides/income-tax-mtd-end-to-end-service-guide/documentation/hmrc-assist.html) section

#### Version 3.2

20 September 2023

* Update content for [Penalties and appeals](/guides/income-tax-mtd-end-to-end-service-guide/documentation/penalties-and-appeals.html) section
* Update content for [Final declaration](/guides/income-tax-mtd-end-to-end-service-guide/documentation/final-declaration.html) section
* Update content for [Production approvals process](#production-approvals-process-for-making-tax-digital-for-income-tax-self-assessment) section
* Update content for [Software choices](#software-choices) section
* Update content for [Bridging software](#bridging-software) section
* Remove Business Validation Rules section

#### Version 3.1

27 June 2023

* Add [API lifecycle & deprecation](/guides/income-tax-mtd-end-to-end-service-guide/documentation/api-deprecation-guidance.html) section, remove some duplicated content

#### Version 3.0

14 June 2023

* Update API and endpoint links

#### Version 2.9

* Update direct links to endpoints to reflect changes in how API documentation is published

#### Version 2.8

* Update HMRC Assist section

#### Version 2.7

* Update guide to reflect simplified v3.0 final declaration process and update section on customers opting out of MTD

#### Version 2.6

* Update guide to reflect API changes, including refactored Self Assessment Accounts API

#### Version 2.5

* Update guide to reflect new API versions, update links and correct and clarify some content

#### Version 2.4

* Update Frequently Asked Questions section to remove some items

#### Version 2.3

* Add note and an example table demonstrating how adjustments submitted work

#### Version 2.2

* Add a Frequently Asked Questions section to the menu tree

#### Version 2.1

* Notice of version change to Business Income Source Summary V1.0
* Replace 'Set up' heading with 'Sign up' with and update menu tree to have only three sections: **Agent**, **Individual** and **Link software to HMRC**
* Update content in the **Minimum functionality standards** section and add two other sections: **Bridging software** and **Non-MTD products**
* Update content in the **Declaration** and **Declaration for agents** sections of **Final declaration** (previously called 'crystallisation')

#### Version 2.0

* Add Capital Gains Tax, Marriage Allowance, Non-PAYE Income, Coding out underpayments and debts

#### Version 1.9

* Add requirement for businesses and landlords to provide information about residential property disposals
* Add information regarding BSAS adjustments
* Add content changes to meet MTD Style Guide V2.2
* Replace the term ‘crystallisation’ with ‘final declaration'

#### Version 1.8

* Add deprecation dates for Self Assessment API Endpoints
* Notice of version change to Business Source Adjustable Summary (MTD) - V 1.0
* Notice of version change to Individual Losses (MTD) - V1.0
* Notice of version change to Individual Calculations v 1.0

#### Version 1.7

* Change title to Income Tax (Making Tax Digital) end-to-end Service Guide
* Include Income Tax (MTD) APIs
* Include Tax Terminology
* Add Foreign Property reference to Obligations
* Replace the term 'taxpayers' with 'customers'
* Replace references to SA Accounting Summary API with BSAS API

#### Version 1.6

* Revise wording for Draft MTD ITSA Regulations 2021 page

#### Version 1.5

* Add Production approvals process for Making Tax Digital for Self Assessment
* Add early draft MTD ITSA Regulations 2021 section

#### Version 1.4

* Update Construction Industry Scheme (CIS) section

#### Version 1.3

* Update Losses
* Add Additional information section

#### Version 1.2

* Add Multiple businesses section
* Add Construction Industry Scheme (CIS) section

#### Version 1.1

* Add Payments and liabilities section
