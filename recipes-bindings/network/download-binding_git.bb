SUMMARY = "download api for AGL"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE-2.0;md5=3b83ef96387f14655fc854ddc3c6bd57"

inherit cmake

PV = "1.0+git${SRCPV}"
S  = "${WORKDIR}/git"
SRC_URI = "git://github.com/nds-osk/download-binding.git;protocol=https"
SRCREV  = "5ab9bb26a91b43bd8ca32cc8de72687483b7d326"

DEPENDS += "json-c"
DEPENDS += "systemd"
DEPENDS += "af-binder"

RDEPENDS_${PN}_append = " libcurl (>= 7.47.1)"

FILES_${PN} += "${libdir}"
