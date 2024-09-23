# Making Tax Digital for Income Tax end-to-end service guide

> **Preview version 24 September** - this is a preview of upcoming changes to the public MTD service guide to add the [End-to-end customer journey](#end-to-end-customer-journey) section. <br/>To view the current service guide, [go here](https://developer.service.hmrc.gov.uk/guides/income-tax-mtd-end-to-end-service-guide/)

This service guide explains how you can integrate your software with the [Making Tax Digital for Income Tax APIs](/api-documentation/docs/api?filter=income-tax-mtd). 

> **Help us improve this guide**: [leave your feedback here](https://docs.google.com/forms/d/e/1FAIpQLSe9jb0WCXWO9yt6zLBTKZLSK2oiTQcGPD96CTiwnQF0QxH5Tw/viewform).

## Overview

This guidance explains how you can integrate your software with our APIs. It provides examples of how they fit into various end-to-end user journeys to enable individuals and their agents, where authorised, to meet their obligations after they have signed up to Making Tax Digital (MTD).

For more information about eligibility, sign-up and how customers will use MTD, refer to [Making Tax Digital for Income Tax step by step guidance (GOV.UK)](https://www.gov.uk/guidance/use-making-tax-digital-for-income-tax).

HMRC's vision for Making Tax Digital for Income Tax is to allow individuals to fulfil their income tax obligations entirely through compatible software whilst still being fully responsible for the data that is submitted. Customers will be able to:

- maintain a digital record of their tax affairs
- submit quarterly updates of income and expenditure
- make any tax allowances and adjustments
- claim for losses
- make any accounting adjustments as needed
- receive nudges and prompts from HMRC
- submit any other income sources
- make a final declaration to submit a tax return 

HMRC will provide APIs to support submission of all personal data items under Self Assessment as set out above - that is, all the things individuals need to do to comply with their Income Tax obligations. This will create market demand for compatible software that enables users to finalise the entirety of their tax affairs.

## Compatible software

Compatible software can mean either a single end-to-end piece of software or a set of compatible software products. To gain Production access to our APIs, software needs to meet the [minimum functionality standards](/guides/income-tax-mtd-end-to-end-service-guide/documentation/how-to-integrate.html#minimum-functionality-standards).

HMRC recognises that an all-in-one product will not be right for everyone, and some customers or agents may wish to use combinations of different pieces of software. For example, combining dedicated record keeping software with dedicated tax filing software. When a customer uses a combination of products, after they have entered a digital record into a compatible software product, they must be able to follow the rules for digital links set out by HMRC in the Software Notice.

### Bridging software

Some customers may wish to integrate their existing software solution for record keeping with MTD by using another product that can submit quarterly updates, make a final declaration and view tax liabilities. We refer to these products as 'bridging products'. 

Customers who choose to use bridging software must digitally link it to their record-keeping software. This will ensure that customers meet their obligations when they use multiple compatible software products which collectively meet the [minimum functionality standards](/guides/income-tax-mtd-end-to-end-service-guide/documentation/how-to-integrate.html#minimum-functionality-standards) set out in this guide.

For more information about digitally linking to software, refer to [Use Making Tax Digital for Income Tax (GOV.UK)](https://www.gov.uk/guidance/use-making-tax-digital-for-income-tax/keep-digital-records).

### Free-to-use software

The UK government is committed to ensuring the availability of free software products for small businesses with simple tax affairs that are mandated to use Making Tax Digital for Income Tax. HMRC strongly encourages all software providers to produce a free version of their software.

In addition to meeting the [minimum functionality standards](/guides/income-tax-mtd-end-to-end-service-guide/documentation/how-to-integrate.html#minimum-functionality-standards) set out in this guide, we expect any free software product you provide to businesses with the simplest tax affairs to:

- have a reasonable level of guidance
- have help and support to users
- be free for the business to use to comply with their Making Tax Digital for Income Tax obligations for a full annual accounting period

There is no expectation that a free product will include VAT, Corporation Tax or PAYE functionality. HMRC would not require free software to link or integrate with an agent product. However, free software could be used in conjunction with wider compatible software products, if necessary.

## Mapping APIs to Self Assessment tax return forms

Parameters in some MTD APIs map to box numbers in [Self Assessment tax return forms (GOV.UK)](https://www.gov.uk/self-assessment-tax-return-forms). You can download this mapping information as CSV files from [income-tax-mtd-changelog/mapping](https://github.com/hmrc/income-tax-mtd-changelog/blob/main/mapping/mapping-csv-files.md) (GitHub).

## Navigating our documentation

The following table lists the documents for Making Tax Digital for Income Tax and outlines the content and intended readers of each document.

| Document | Summary | Content type | Intended readers |
| -------- | ------- | ------------ | ---------------- |
| [Roadmap](/roadmaps/mtd-itsa-vendors-roadmap/#making-tax-digital-itsa-roadmap) | Learn about upcoming changes to Making Tax Digital for Income Tax APIs and HMRC online services. | Functional | Product managers<br /><br />Business analysts |
| End-to-end service guide (this document) | Learn how you can integrate your application software with Making Tax Digital for Income Tax APIs. | Functional | Product managers<br /><br />Business analysts<br /><br />Software developers |
| [API landing pages](/api-documentation/docs/api?filter=income-tax-mtd) <br /><br />Example:<br/> [Business Details API](/api-documentation/docs/api/service/business-details-api/) | Learn about the high-level functionality of each API. | Functional | Product managers<br /><br />Business analysts<br /><br />Software developers |
| API reference pages (accessible from API landing pages)<br /><br />Example:<br/> [Business Details API v1.0](https://developer.service.hmrc.gov.uk/api-documentation/docs/api/service/business-details-api/1.0/oas/page) | Learn in detail about the request and response schemas, test data and error handling of each API. | Technical | Business analysts<br /><br />Software developers |

## End-to-end customer journey

The following end-to-end journey is for a MTD customer with:

- self-employment income and expenses
- dividends income
- annual investment allowance
- business insurance adjustments

<a href="figures/end-to-end.svg" target="blank"><img src="figures/end-to-end.svg" alt="End-to-end customer journey diagram" style="width:720px;" /></a>

<a href="figures/end-to-end.svg" target="blank">Open the end-to-end journey diagram in a new tab.</a>

1. The customer creates digital records for the new tax year 
2. The customer checks their obligations for the tax year
3. The software calls the [List All Businesses](https://developer.service.hmrc.gov.uk/api-documentation/docs/api/service/business-details-api/1.0/oas/page#/paths/~1individuals~1business~1details~1%7Bnino%7D~1list/get) endpoint to retrieve the business ID
4. The software uses the business ID to call the [Retrieve Income Tax (Self Assessment) Income and Expenditure Obligations](https://developer.service.hmrc.gov.uk/api-documentation/docs/api/service/obligations-api/2.0/oas/page#/paths/~1obligations~1details~1%7Bnino%7D~1income-and-expenditure/get) endpoint to retrieve the customer obligations
5. HMRC receives the request and returns the obligations
6. The software displays the obligations 
7. The customer views their obligations 
8. The software prepares summary of Quarter 1 income and expenses and displays it to the customer
9. The customer reviews the information and begins their Quarter 1 submission process
10. The software initiates the data submission process by calling [Create a Self-Employment Period Summary](https://developer.service.hmrc.gov.uk/api-documentation/docs/api/service/self-employment-business-api/3.0/oas/page#tag/Self-Employment-Period-Summaries) endpoint
11. HMRC receives receives the submission and updates records
12. The software displays the confirmation that the update has been received and stored by HMRC
13. The customer views the confirmation
14. The customer makes Quarter 2,3,4 submission (same steps as Q1)
15. The customer begins the submission of their allowances 
16. The software calls the [Create and Amend Self-Employment Annual Submission](https://developer.service.hmrc.gov.uk/api-documentation/docs/api/service/self-employment-business-api/3.0/oas/page#tag/Self-Employment-Annual-Submission/paths/~1individuals~1business~1self-employment~1%7Bnino%7D~1%7BbusinessId%7D~1annual~1%7BtaxYear%7D/put) endpoint to submit the allowances
17. HMRC receives the allowances and updates records
18. The software displays the confirmation of the update
19. The customers views the confirmation
20. The customer needs to make an accounting adjustment to adjust part of their current year expense to the next tax year
21. The customer makes adjustments to business insurance in their digital records
22. The customer begins the submission of these adjustments to HMRC
23. The software calls the [Submit Self-Employment Accounting Adjustments](https://developer.service.hmrc.gov.uk/api-documentation/docs/api/service/self-assessment-bsas-api/5.0/oas/page#tag/Self-employment-business/paths/~1individuals~1self-assessment~1adjustable-summary~1%7Bnino%7D~1self-employment~1%7BcalculationId%7D~1adjust/post) endpoint to submit the adjustments
24. HMRC receives the adjustments and updates records
25. The software displays the confirmation of the update
26. The customers views the confirmation
27. The customer begins the submission of their dividends income
28. The software calls the [Create and Amend Dividends Income](https://developer.service.hmrc.gov.uk/api-documentation/docs/api/service/individuals-dividends-income-api/1.0/oas/page#tag/Dividends-Income/paths/~1individuals~1dividends-income~1%7Bnino%7D~1%7BtaxYear%7D/put) endpoint to submit their savings income
29. HMRC receives the submission and updates records
30. The software displays the confirmation of the update
31. The customers views the confirmation
32. The customer is ready to make their final declaration
33. The software calls the [Trigger a Self Assessment Tax Calculation](https://developer.service.hmrc.gov.uk/api-documentation/docs/api/service/individual-calculations-api/5.0/oas/page#tag/Tax-Calculations/paths/~1individuals~1calculations~1%7Bnino%7D~1self-assessment~1%7BtaxYear%7D/post) endpoint with finalDeclaration parameter as true
34. HMRC receives the request, starts tax calculation and returns calculation ID
35. HMRC generates final declaration tax calculation (converts any business validation warnings into errors)
36. The software receives calculation ID
37. The software calls the [Retrieve A Self Assessment Tax Calculation](https://developer.service.hmrc.gov.uk/api-documentation/docs/api/service/individual-calculations-api/5.0/oas/page#tag/Tax-Calculations/paths/~1individuals~1calculations~1%7Bnino%7D~1self-assessment~1%7BtaxYear%7D~1%7BcalculationId%7D/get) endpoint using calculation ID
38. HMRC returns the tax calculation with the requested calculation ID
39. The software receives tax calculation results if call is successful (if there are errors, it cannot be viewed)
40. The customer views final tax calculation results
41. The customer reviews and confirms the calculation and declaration text 
42. The software receives confirmation and calls the [Submit a Self Assessment Final Declaration](https://developer.service.hmrc.gov.uk/api-documentation/docs/api/service/individual-calculations-api/5.0/oas/page#tag/Final-Declaration/paths/~1individuals~1calculations~1%7Bnino%7D~1self-assessment~1%7BtaxYear%7D~1%7BcalculationId%7D~1final-declaration/post) endpoint to confirm calculation
43. HMRC receives the submission and marks the obligation as fulfilled 
44. The software displays the confirmation of the submission (HMRC does not do this)
45. The customer views confirmation that the return has been submitted successfully to HMRC

## Changelogs

### API changelog

The [API changelog](https://github.com/hmrc/income-tax-mtd-changelog) (GitHub) provides detailed and comprehensive information about API changes.

### Document changelog

Below is a summary of updates to this service guide.

#### 17 September 2024

- Update [HMRC online services](/guides/income-tax-mtd-end-to-end-service-guide/documentation/tasks-outside-mtd-software.html#hmrc-online-services) section in 'Tasks outside MTD software' to reflect new releases
- Add [Cumulative updates](/guides/income-tax-mtd-end-to-end-service-guide/documentation/make-updates-during-tax-year.html#cumulative-updates) guidance to 'Making updates during the tax year'

#### 2 September 2024

- Add [Changing the amount of payments on account](/guides/income-tax-mtd-end-to-end-service-guide/documentation/tasks-outside-mtd-software.html#change_poa) section to 'Tasks outside MTD software'

#### 5 August 2024

- Update service name to 'Making Tax Digital for Income Tax' throughout

#### 1 August 2024

- Update [Penalties and appeals](/guides/income-tax-mtd-end-to-end-service-guide/documentation/make-updates-at-tax-year-end.html#penalties-and-appeals) section

#### 19 July 2024

- Update service guide to use current MTD terminology where applicable
- Add details of in-year or end-of-year reporting for [Additional information](/guides/income-tax-mtd-end-to-end-service-guide/documentation/make-updates-at-tax-year-end.html#additional-information) items
- Revise [Making a payment](/guides/income-tax-mtd-end-to-end-service-guide/documentation/tasks-outside-mtd-software.html#making-a-payment) and remove 'Pay or get a repayment' section
- Update links to the deprecated Individuals Income Received API to point to the equivalent new endpoints

#### 16 July 2024

- Update annual turnover threshold for submitting consolidated expenses in [Submit quarterly update](/guides/income-tax-mtd-end-to-end-service-guide/documentation/make-updates-during-tax-year.html#submit-quarterly-update) (from £85,000 to £90,000)
- Update response time details and GOV.UK link in [Supporting customers in MTD](/guides/income-tax-mtd-end-to-end-service-guide/documentation/how-to-integrate.html#supporting-customers-in-mtd)
- Remove mentions of end-of-period statements (EOPS)

#### 5 July 2024

- Add [MTD terminology (style guide)](/guides/income-tax-mtd-end-to-end-service-guide/documentation/mtd-terminology.html) section
- Update [API status](/guides/income-tax-mtd-end-to-end-service-guide/documentation/how-to-integrate.html#api-status) table with note about fully deprecated APIs

#### 20 June 2024

- Revise Overview and Software provider sections
- Revise Minimum functionality standards section
- Revise Getting Production Approval section
- Retitle Stateful and dynamic testing section to 'Sandbox testing'
- Update HMRC Assist section

#### 11 June 2024

- Add section Navigating Income Tax (Making Tax Digital) API documentation

#### 28 May 2024

- Update API endpoint links within this document to point to latest available versions
- Update Penalties and appeals section with latest information about Penalty Reform for ITSA
- Update HMRC Assist section introduction

#### 30 April 2024

- Implement revised document structure (no content has been removed)

#### 23 April 2024

- Update user research contact email address

#### 16 April 2024

- Add section Stateful and dynamic testing, which includes an example user journey to:
  - make a Self-Employment or Property Business submission
  - request a Business Source Adjustable Summary
- Add section Mapping APIs to Self Assessment tax return forms
- Update Business and property income section:
  - remove sentence from section Submit quarterly update about error if £85,000 limit is exceeded
  - remove flow chart from section Submit accounting adjustments
- Update Additional information section:
  - update section introduction with new content about breakup of Individuals Income Received API
  - update API endpoint links to point to new APIs that replace Individuals Income Received API

#### 18 March 2024

- Update Business and property income section:
  - add new section Change to calendar quarters
  - add new content to section Submit quarterly update
- Update Final declaration section:
  - remove all references to 'crystallisation'
  - remove sections Calculations that produce errors and Calculations that are free from errors, which are now in section Tax calculations
  - change 'calcuationId' to 'Calculation ID' and 'finalDeclaraton' to 'Final Declaration'
  - update tax account links in section Pay or get a repayment
- Update HMRC online services section:
  - update status of 'Elect for calendar quarterly periods' task
  - add new table column that explains choice of service (HMRC online services or software or both) used to make each functionality available
- Update Using tax codes to collect tax due section (formerly Coding Out):
  - retitle section
  - rewrite section
  - add content about opting out

#### 31 January 2024

- Update Deprecating APIs section with details about new deprecation headers
- Update the following section of Business and property income section:

  - Tax calculations (formerly Retrieve a tax calculation)

- Update the following sections of Additional information section (formerly Additional Income):

  - New section introduction for Additional Information (remove Submit information about personal income)
  - Employments (move some content to new section Employment Expenses)
  - Dividends Income
  - Pensions Income
  - Other Income
  - Savings Income
  - Savings Accounts
  - Disclosures
  - Individual Charges (formerly Pension Charges)
  - Individual Reliefs
  - Other Deductions
  - Employment Expenses (formerly Individual Expenses Other)
  - Non-PAYE Income
  - State Benefits
  - Providing information about how to treat a loss

#### 24 January 2024

- Update the following sections of Business and property income section:

  - Retrieving obligations
  - Submit quarterly updates for self-employment and property businesses
  - Submit annual updates for self-employment and property businesses
  - Submit accounting adjustments
  - Construction Industry Scheme
  - Finalise business income End of Period Statement (EOPS)
  - Tax calculations (formerly 'Retrieve a tax calculation')

- Move the content of the following sections to other sections in Business and Property Income section:

  -  Business Income Source Summary
  -  View previously submitted updates
  -  Making changes to previously submitted data
  -  Multiple businesses

- Update the HMRC online services section as follows:

  - update status of 2 tasks
  - move Opting out of MTD section into HMRC online services section

- Update the following sections of Additional information section:

  - Foreign Income
  - Insurance Policies Income
  - Capital Gains Tax
  - Marriage Allowance

#### 13 December 2023

* Update Additional information / Employments section with off-payroll working details
* Update Customer support mode section
* Update Using tax codes to collect tax due section (formerly Coding Out)
* Update UR contact email address

#### 15 November 2023

* Update content and diagram in Payments and liabilities section
* Remove crystallisation endpoint content from Final declaration section

#### 2 November 2023

* Add new Customer status section describing business purpose of the new Self Assessment Individual Details API
* Update Construction Industry Scheme section and move it into Business and Property Income section
* Update Software choices section
* Update APIs in Minimum functionality standards section
* Remove duplicate Finalise business income End of Period Statement (EOPS) section

#### 4 October 2023

* Update content for HMRC online services section
* Update content for Opting out of MTD section
* Update content for HMRC Assist section

#### 20 September 2023

* Update content for Penalties and appeals section
* Update content for Final declaration section
* Update content for Production approvals process section
* Update content for Software choices section
* Update content for Bridging software section
* Remove Business Validation Rules section

#### 27 June 2023

* Add API lifecycle & deprecation section, remove some duplicated content

#### 14 June 2023

* Update API and endpoint links