

// 	private Specification<Lead> getSpecs(String companyId, String serviceType, String subServiceType,
// 			String addressId) {
// 		return (root, query, builder) -> {
// 			Join<Lead, LeadItem> leadItem = root.join("leadItem", JoinType.INNER);
// 			Join<LeadItem, LocationDetails> locationDetails = leadItem.join("locations", JoinType.INNER);

// 			List<Predicate> predicates = new ArrayList<>();
// 			predicates.add(builder.and(builder.isNotNull(root.get(ApplicationConstants.PARENT))));
// 			predicates.add(builder.and(builder.isTrue(root.get("enabled"))));
// 			predicates.add(builder.and(builder.notEqual(root.get("status"), LeadStatus.ORDER_REJECTED.name())));
// 			predicates.add(builder.and(builder.notEqual(root.get("status"), LeadStatus.CLOSED.name())));

// 			if (StringUtils.isNotBlank(addressId)) {
// 				predicates.add(builder.and(builder.equal(locationDetails.get("addressId"), addressId)));
// 			}

// 			if (StringUtils.isNotBlank(companyId)) {
// 				predicates.add(builder.and(builder.equal(root.get("companyId"), companyId)));
// 			}

// 			if (StringUtils.isNotBlank(serviceType)) {
// 				predicates.add(builder.and(builder.equal(leadItem.get("serviceType"), serviceType)));
// 			}

// 			if (StringUtils.isNotBlank(subServiceType)) {
// 				predicates.add(builder.and(builder.equal(leadItem.get("subServiceType"), subServiceType)));
// 			}

// 			return builder.and(predicates.toArray(new Predicate[predicates.size()]));
// 		};

// 	}
